package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasDataSourceIterator theMagazineHasDataSourceIterator = (MagazineHasDataSourceIterator)findAncestorWithClass(this, MagazineHasDataSourceIterator.class);
			pageContext.getOut().print(theMagazineHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}
