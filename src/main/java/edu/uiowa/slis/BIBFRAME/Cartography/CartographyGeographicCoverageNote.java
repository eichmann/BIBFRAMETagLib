package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyGeographicCoverageNoteIterator theCartography = (CartographyGeographicCoverageNoteIterator)findAncestorWithClass(this, CartographyGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theCartography.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

