window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {
 var item; item = this.cronapi.dateTime.updateDate(null, 0, 0, 0, 0, 0, 0, 0);
             
  this.cronapi.screen.changeValueOfField("", '');
}
