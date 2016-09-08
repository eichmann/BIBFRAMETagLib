package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineTranslatesIterator theMagazineTranslatesIterator = (MagazineTranslatesIterator)findAncestorWithClass(this, MagazineTranslatesIterator.class);
			pageContext.getOut().print(theMagazineTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for translates tag ");
		}
		return SKIP_BODY;
	}
}

