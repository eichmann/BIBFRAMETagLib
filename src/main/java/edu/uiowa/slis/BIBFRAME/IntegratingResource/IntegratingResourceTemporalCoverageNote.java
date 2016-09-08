package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceTemporalCoverageNoteIterator theIntegratingResource = (IntegratingResourceTemporalCoverageNoteIterator)findAncestorWithClass(this, IntegratingResourceTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theIntegratingResource.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

