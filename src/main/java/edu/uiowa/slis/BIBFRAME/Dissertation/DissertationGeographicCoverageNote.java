package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationGeographicCoverageNoteIterator theDissertation = (DissertationGeographicCoverageNoteIterator)findAncestorWithClass(this, DissertationGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theDissertation.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

