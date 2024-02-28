const logOutput = document.getElementById('log-output');

const originalConsoleLog = console.log;

console.log = function(message) {
    originalConsoleLog.apply(console, arguments);

    if (message !== 'Jar is loaded, main is starting' && message != 'CheerpJ runtime ready') {
        logOutput.value += message;
    }
};
