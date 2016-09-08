package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOtherEditionIterator theMagazineHasOtherEditionIterator = (MagazineHasOtherEditionIterator)findAncestorWithClass(this, MagazineHasOtherEditionIterator.class);
			pageContext.getOut().print(theMagazineHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

