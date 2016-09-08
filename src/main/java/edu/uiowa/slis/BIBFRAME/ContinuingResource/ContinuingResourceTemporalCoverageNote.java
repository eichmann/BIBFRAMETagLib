package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceTemporalCoverageNoteIterator theContinuingResource = (ContinuingResourceTemporalCoverageNoteIterator)findAncestorWithClass(this, ContinuingResourceTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theContinuingResource.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

