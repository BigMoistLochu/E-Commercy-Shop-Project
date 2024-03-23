$(document).ready(function(){
    // Po kliknięciu przycisku "Register"
    $("#registerBtn").click(function(){
        // Zamknij istniejące okno modalne logowania (jeśli istnieje)
        $("#loginModal").modal("hide");
        // Otwórz okno modalne rejestracji
        $("#registerModal").modal("show");
    });

    $("#loginBtn").click(function(){
        // Zamknij istniejące okno modalne logowania (jeśli istnieje)
        $("#registerModal").modal("hide");

        // Otwórz okno modalne rejestracji
        $("#loginModal").modal("show");
    });
});
