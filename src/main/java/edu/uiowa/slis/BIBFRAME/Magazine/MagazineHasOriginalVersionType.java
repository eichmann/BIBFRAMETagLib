package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOriginalVersionIterator theMagazineHasOriginalVersionIterator = (MagazineHasOriginalVersionIterator)findAncestorWithClass(this, MagazineHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMagazineHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

