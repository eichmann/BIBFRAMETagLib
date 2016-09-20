package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineLanguageIterator theMagazineLanguageIterator = (MagazineLanguageIterator)findAncestorWithClass(this, MagazineLanguageIterator.class);
			pageContext.getOut().print(theMagazineLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for language tag ");
		}
		return SKIP_BODY;
	}
}

