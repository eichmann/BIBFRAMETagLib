package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleDerivedFromIterator theTransliteratedTitleDerivedFromIterator = (TransliteratedTitleDerivedFromIterator)findAncestorWithClass(this, TransliteratedTitleDerivedFromIterator.class);
			pageContext.getOut().print(theTransliteratedTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

