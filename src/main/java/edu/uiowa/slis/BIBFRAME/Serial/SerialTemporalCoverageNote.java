package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialTemporalCoverageNoteIterator theSerial = (SerialTemporalCoverageNoteIterator)findAncestorWithClass(this, SerialTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theSerial.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

