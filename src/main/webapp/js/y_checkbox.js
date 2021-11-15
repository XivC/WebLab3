function y_checkbox_update(id) {
    let checkboxes = document.getElementsByName('y_checkbox')
    for (let i = 0; i < checkboxes.length; i++) {

        if (checkboxes[i].id !== id) {
            checkboxes[i].checked = false

        }
    }
}