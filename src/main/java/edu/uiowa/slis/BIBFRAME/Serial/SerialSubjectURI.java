package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			if (!theSerial.commitNeeded) {
				pageContext.getOut().print(theSerial.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			return theSerial.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Serial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Serial theSerial = (Serial)findAncestorWithClass(this, Serial.class);
			theSerial.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for subjectURI tag ");
		}
	}
}

