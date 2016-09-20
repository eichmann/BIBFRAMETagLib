package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsFirstOfIterator theMagazineIsFirstOfIterator = (MagazineIsFirstOfIterator)findAncestorWithClass(this, MagazineIsFirstOfIterator.class);
			pageContext.getOut().print(theMagazineIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

