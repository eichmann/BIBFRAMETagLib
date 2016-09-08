package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasDataSourceIterator theMonographHasDataSourceIterator = (MonographHasDataSourceIterator)findAncestorWithClass(this, MonographHasDataSourceIterator.class);
			pageContext.getOut().print(theMonographHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

