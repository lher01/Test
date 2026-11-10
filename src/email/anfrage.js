const anzahlField = document.getElementById("anzahl");
const errorMessage = document.getElementById("error-message");

anzahlField.addEventListener("input", () => {
	// Wenn das Feld nicht leer ist und die Validierung fehlschlägt (z.B. < 1 oder Kommazahl)
	if (anzahlField.value !== "" && !anzahlField.checkValidity()) {
		anzahlField.classList.add("invalid"); // Macht das Kästchen rot
		errorMessage.classList.remove("error-hidden");
		errorMessage.classList.add("error-visible"); // Zeigt den Text an
	} else {
		anzahlField.classList.remove("invalid"); // Entfernt die rote Umrandung
		errorMessage.classList.remove("error-visible");
		errorMessage.classList.add("error-hidden"); // Versteckt den Text
	}
});
