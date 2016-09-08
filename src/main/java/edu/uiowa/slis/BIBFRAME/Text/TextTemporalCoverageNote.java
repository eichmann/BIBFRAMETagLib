package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TextTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextTemporalCoverageNoteIterator theText = (TextTemporalCoverageNoteIterator)findAncestorWithClass(this, TextTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theText.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

