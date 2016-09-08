package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceTemporalCoverageNoteIterator theFiniteResource = (FiniteResourceTemporalCoverageNoteIterator)findAncestorWithClass(this, FiniteResourceTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theFiniteResource.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

