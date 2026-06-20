-- Scenario 1

BEGIN

    FOR customer_rec IN
    (
        SELECT CustomerID, Age
        FROM Customers
    )
    LOOP

        IF customer_rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/

-- Scenario 2

BEGIN

    FOR customer_rec IN
    (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP

        IF customer_rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/

-- Scenario 3

BEGIN

    FOR loan_rec IN
    (
        SELECT LoanID,
               CustomerID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE
                         AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_rec.LoanID
            || ' for Customer '
            || loan_rec.CustomerID
            || ' is due on '
            || loan_rec.DueDate
        );

    END LOOP;

END;
/