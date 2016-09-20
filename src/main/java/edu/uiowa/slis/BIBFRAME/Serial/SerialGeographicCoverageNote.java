package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialGeographicCoverageNoteIterator theSerial = (SerialGeographicCoverageNoteIterator)findAncestorWithClass(this, SerialGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theSerial.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

