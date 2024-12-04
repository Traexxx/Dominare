document.addEventListener("DOMContentLoaded", function () {
    const toggler = document.querySelector(".navbar-toggler");
    const icon = toggler.querySelector("i");

    toggler.addEventListener("click", function () {
        const isExpanded = toggler.getAttribute("aria-expanded") === "true";

        
        if (isExpanded) {
            icon.classList.remove("bi-chevron-right");
            icon.classList.add("bi-chevron-left");
        } else {
            icon.classList.remove("bi-chevron-left");
            icon.classList.add("bi-chevron-right");
        }
    });
});

document.getElementById("submitVote").addEventListener("click", function () {
    const options = document.getElementsByName("voteOption");
    let selectedOption = null;

    // Verifica qual opção foi selecionada
    options.forEach(option => {
        if (option.checked) {
            selectedOption = option.value;
        }
    });

    const resultMessage = document.getElementById("resultMessage");

    if (selectedOption) {
        resultMessage.textContent = `Você votou em: ${selectedOption}`;
        resultMessage.style.color = "green";

        // Aqui você pode enviar o voto para o backend usando uma requisição fetch() ou outra abordagem
        console.log(`Voto enviado: ${selectedOption}`);
    } else {
        resultMessage.textContent = "Por favor, selecione uma opção antes de enviar.";
        resultMessage.style.color = "red";
    }
});

