package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineReceivedIterator theMagazineReceivedIterator = (MagazineReceivedIterator)findAncestorWithClass(this, MagazineReceivedIterator.class);
			pageContext.getOut().print(theMagazineReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for received tag ");
		}
		return SKIP_BODY;
	}
}
