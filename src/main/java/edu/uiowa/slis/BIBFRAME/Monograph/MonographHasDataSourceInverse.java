package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasDataSourceInverseIterator theMonographHasDataSourceInverseIterator = (MonographHasDataSourceInverseIterator)findAncestorWithClass(this, MonographHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMonographHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

