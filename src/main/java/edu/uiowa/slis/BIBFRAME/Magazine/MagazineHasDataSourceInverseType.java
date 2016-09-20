package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasDataSourceInverseIterator theMagazineHasDataSourceInverseIterator = (MagazineHasDataSourceInverseIterator)findAncestorWithClass(this, MagazineHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMagazineHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

