package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceGeographicCoverageNoteIterator theFiniteResource = (FiniteResourceGeographicCoverageNoteIterator)findAncestorWithClass(this, FiniteResourceGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theFiniteResource.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

