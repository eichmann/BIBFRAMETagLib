package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileContentsNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileContentsNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileContentsNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileContentsNoteIterator theTactile = (TactileContentsNoteIterator)findAncestorWithClass(this, TactileContentsNoteIterator.class);
			pageContext.getOut().print(theTactile.getContentsNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for contentsNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for contentsNote tag ");
		}
		return SKIP_BODY;
	}
}

