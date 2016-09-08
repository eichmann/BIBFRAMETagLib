package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceGeographicCoverageNoteIterator theContinuingResource = (ContinuingResourceGeographicCoverageNoteIterator)findAncestorWithClass(this, ContinuingResourceGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theContinuingResource.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

