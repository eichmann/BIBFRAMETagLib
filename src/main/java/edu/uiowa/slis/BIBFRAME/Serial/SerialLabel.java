package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			if (!theSerial.commitNeeded) {
				pageContext.getOut().print(theSerial.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			return theSerial.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Serial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			theSerial.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for label tag ");
		}
	}
}

