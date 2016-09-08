package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOriginalVersionIterator theMagazineHasOriginalVersionIterator = (MagazineHasOriginalVersionIterator)findAncestorWithClass(this, MagazineHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMagazineHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

