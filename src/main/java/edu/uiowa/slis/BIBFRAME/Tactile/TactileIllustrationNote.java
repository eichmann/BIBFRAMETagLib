package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIllustrationNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIllustrationNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIllustrationNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileIllustrationNoteIterator theTactile = (TactileIllustrationNoteIterator)findAncestorWithClass(this, TactileIllustrationNoteIterator.class);
			pageContext.getOut().print(theTactile.getIllustrationNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for illustrationNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for illustrationNote tag ");
		}
		return SKIP_BODY;
	}
}

