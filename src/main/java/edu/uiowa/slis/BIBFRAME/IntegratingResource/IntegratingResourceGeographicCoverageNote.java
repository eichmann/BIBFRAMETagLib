package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceGeographicCoverageNoteIterator theIntegratingResource = (IntegratingResourceGeographicCoverageNoteIterator)findAncestorWithClass(this, IntegratingResourceGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theIntegratingResource.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

