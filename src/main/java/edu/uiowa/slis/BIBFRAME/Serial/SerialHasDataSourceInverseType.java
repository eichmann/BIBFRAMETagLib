package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasDataSourceInverseIterator theSerialHasDataSourceInverseIterator = (SerialHasDataSourceInverseIterator)findAncestorWithClass(this, SerialHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theSerialHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

