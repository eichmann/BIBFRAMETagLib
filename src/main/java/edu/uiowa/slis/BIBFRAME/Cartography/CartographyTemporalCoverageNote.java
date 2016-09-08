package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyTemporalCoverageNoteIterator theCartography = (CartographyTemporalCoverageNoteIterator)findAncestorWithClass(this, CartographyTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theCartography.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

