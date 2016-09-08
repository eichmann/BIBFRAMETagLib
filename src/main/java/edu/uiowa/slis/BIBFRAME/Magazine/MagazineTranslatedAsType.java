package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineTranslatedAsIterator theMagazineTranslatedAsIterator = (MagazineTranslatedAsIterator)findAncestorWithClass(this, MagazineTranslatedAsIterator.class);
			pageContext.getOut().print(theMagazineTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

