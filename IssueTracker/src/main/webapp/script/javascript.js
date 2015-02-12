function sendRequest (url) {
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/IssueTracker/" + url);
    xhr.send();
    xhr.onload = function () {
        var output = this.responseText;
        console.log(this.responseText);
        window.location.href = CurrentProject.jsp;
    };
};

