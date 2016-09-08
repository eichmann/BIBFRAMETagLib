package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationTemporalCoverageNoteIterator theDissertation = (DissertationTemporalCoverageNoteIterator)findAncestorWithClass(this, DissertationTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theDissertation.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

