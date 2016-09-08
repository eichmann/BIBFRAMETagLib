package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographGeographicCoverageNoteIterator theMonograph = (MonographGeographicCoverageNoteIterator)findAncestorWithClass(this, MonographGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theMonograph.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

