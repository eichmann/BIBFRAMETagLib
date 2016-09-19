package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleDerivedFromIterator theTransliteratedTitleDerivedFromIterator = (TransliteratedTitleDerivedFromIterator)findAncestorWithClass(this, TransliteratedTitleDerivedFromIterator.class);
			pageContext.getOut().print(theTransliteratedTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

