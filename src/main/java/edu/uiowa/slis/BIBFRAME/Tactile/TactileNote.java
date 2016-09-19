package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileNoteIterator theTactile = (TactileNoteIterator)findAncestorWithClass(this, TactileNoteIterator.class);
			pageContext.getOut().print(theTactile.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for note tag ");
		}
		return SKIP_BODY;
	}
}

