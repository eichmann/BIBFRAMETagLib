package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceLanguageNoteIterator theContinuingResource = (ContinuingResourceLanguageNoteIterator)findAncestorWithClass(this, ContinuingResourceLanguageNoteIterator.class);
			pageContext.getOut().print(theContinuingResource.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

