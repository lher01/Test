const formular = document.querySelector("#kontaktformular");
const namensfeld = document.querySelector("#name");
const nachrichtenfeld = document.querySelector("#nachricht");
const rueckmeldung = document.querySelector("#rueckmeldung");
const zeichenzaehler = document.querySelector("#zeichenzaehler");
formular.addEventListener("submit", function (event) {
	event.preventDefault();
	const name = namensfeld.value.trim();
	const nachricht = nachrichtenfeld.value.trim();
	if (name.length === 0) {
		rueckmeldung.textContent = "Bitte gib deinen Namen ein.";
		namensfeld.focus();
	} else if (nachricht.length < 20) {
		rueckmeldung.textContent =
			"Bitte beschreibe dein Anliegen mit mindestens 20 Zeichen.";
		nachrichtenfeld.focus();
	} else {
		rueckmeldung.textContent =
			`Danke, ${name}! Deine Eingaben sind gültig. ` +
			"Die Nachricht wurde noch nicht versendet.";
	}
});
function aktualisiereZeichenzaehler() {
	zeichenzaehler.textContent = `${nachrichtenfeld.value.length} / 500 Zeichen`;
}
nachrichtenfeld.addEventListener("input", aktualisiereZeichenzaehler);
aktualisiereZeichenzaehler();
