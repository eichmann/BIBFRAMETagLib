package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			if (!theProducerProvision.commitNeeded) {
				pageContext.getOut().print(theProducerProvision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			return theProducerProvision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ProducerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			theProducerProvision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for subjectURI tag ");
		}
	}
}

