function formatTime(longTime) {
    //return toFull(longTime.getFullYear()) + "-" + toFull((longTime.getMonth() + 1)) + "-" + toFull(longTime.getDate()) +"   "+ toFull(longTime.getHours()) + ":" + toFull(longTime.getMinutes()) + ":" + toFull(longTime.getSeconds());
}

function toFull(targer) {
    if (targer < 10)
        return '0' + targer;
}