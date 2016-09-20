package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineAccompaniesIterator theMagazineAccompaniesIterator = (MagazineAccompaniesIterator)findAncestorWithClass(this, MagazineAccompaniesIterator.class);
			pageContext.getOut().print(theMagazineAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

