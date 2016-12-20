package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNoteIterator theThing = (ThingNoteIterator)findAncestorWithClass(this, ThingNoteIterator.class);
			pageContext.getOut().print(theThing.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for note tag ");
		}
		return SKIP_BODY;
	}
}

