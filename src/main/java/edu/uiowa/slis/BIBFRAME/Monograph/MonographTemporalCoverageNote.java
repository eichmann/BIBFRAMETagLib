package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographTemporalCoverageNoteIterator theMonograph = (MonographTemporalCoverageNoteIterator)findAncestorWithClass(this, MonographTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theMonograph.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

