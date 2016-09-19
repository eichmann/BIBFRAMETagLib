package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleDerivedFromIterator theTranslatedTitleDerivedFromIterator = (TranslatedTitleDerivedFromIterator)findAncestorWithClass(this, TranslatedTitleDerivedFromIterator.class);
			pageContext.getOut().print(theTranslatedTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

