$(document).ready(function () {

    // Register Button Click
    $("#registerBtn").click(function () {

        $("#message").text(
            "Registration Successful!"
        );

    });


    // Fade Out Event Card
    $("#hideBtn").click(function () {

        $(".event-card").fadeOut();

    });


    // Fade In Event Card
    $("#showBtn").click(function () {

        $(".event-card").fadeIn();

    });

});