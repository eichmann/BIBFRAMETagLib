package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectGeographicCoverageNoteIterator theThreeDimensionalObject = (ThreeDimensionalObjectGeographicCoverageNoteIterator)findAncestorWithClass(this, ThreeDimensionalObjectGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

