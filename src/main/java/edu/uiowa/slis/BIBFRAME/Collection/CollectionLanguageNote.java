package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionLanguageNoteIterator theCollection = (CollectionLanguageNoteIterator)findAncestorWithClass(this, CollectionLanguageNoteIterator.class);
			pageContext.getOut().print(theCollection.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

