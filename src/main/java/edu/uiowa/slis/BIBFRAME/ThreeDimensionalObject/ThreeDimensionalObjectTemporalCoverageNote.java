package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectTemporalCoverageNoteIterator theThreeDimensionalObject = (ThreeDimensionalObjectTemporalCoverageNoteIterator)findAncestorWithClass(this, ThreeDimensionalObjectTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

