package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceLanguageNoteIterator theIntegratingResource = (IntegratingResourceLanguageNoteIterator)findAncestorWithClass(this, IntegratingResourceLanguageNoteIterator.class);
			pageContext.getOut().print(theIntegratingResource.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

